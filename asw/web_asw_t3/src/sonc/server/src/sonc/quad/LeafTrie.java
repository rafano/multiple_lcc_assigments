package sonc.quad;

import java.util.HashSet;
import java.util.Set;

public class LeafTrie<T extends HasPoint> extends Trie<T> {

	Set<T> leaf;

	public LeafTrie(double bottomRightX, double bottomRightY, double topLeftX, double topLeftY) {
		super(bottomRightX, bottomRightY, topLeftX, topLeftY);
		leaf = new HashSet<T>();
	}

	@Override
	T find(T point) {
		if(leaf.contains(point))
			return point;
		else return null;
	}

	@Override
	Trie<T> insert(T point) {
		if(leaf.size() < capacity) {
			leaf.add(point);
			return this;
		}
		else {
			NodeTrie<T> newTrie = new NodeTrie<T>(topLeftX,topLeftY,bottomRightX,bottomRightY);
			newTrie.insert(point);
			for(T p : leaf) 
				newTrie.insert(p);
			return newTrie;
		}
	}

	@Override
	Trie<T> insertReplace(T point) {
		for (T p2 : leaf) {
			if(p2.getX() == point.getX() && p2.getY() == point.getY()) {
				leaf.remove(p2);
				leaf.add(point);
				return this;
			}
		}		
		return null;
	}

	@Override
	public String toString() {
		return "LeafTrie [leaf=" + leaf + "]";
	}

	@Override
	void delete(T point) {
		leaf.remove(point);
	}

	@Override
	void collectNear(double x, double y, double radius, Set<T> nodes) {
		double x1,y1;
		for(T point : leaf) {
			x1 = point.getX();
			y1 = point.getY();
			if(getDistance(x,y,x1,y1) > radius)
				nodes.add(point);
		}
	}

	@Override
	void collectAll(Set<T> nodes) {
		nodes.addAll(leaf);
	}
}

