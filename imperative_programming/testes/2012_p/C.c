#include <stdio.h>
int main() {
  int num1,aux=20000 , temp, consec=0,  conta=0 , seq , acima=0, max=0;
  scanf ("%d %d" ,&temp ,&seq );
  while (conta < seq ) {
    conta++;
    scanf("%d" ,&num1);
    if (num1>temp)
      acima++;

    if ( (num1 > temp) && (aux > temp) ) {
      consec++;
      aux = num1;
    }
    else if ( (num1<= temp) && (consec>0)) {
      max=consec;
      consec=0;
    }
    
  }
  if ((max==0) && (acima>0) )
    printf("Temperatura acima de %d graus em dias isolados\n" ,temp);
  else if (consec > 0)
    printf("Temperatura cima de %d durante %d dias consecutivos\n" ,temp ,max);
  else printf("Temperatura nunca acima de %d graus\n" ,temp);
  return 0;
}
	
      
    
