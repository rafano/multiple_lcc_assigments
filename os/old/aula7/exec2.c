#include <stdio.h>
#include <signal.h>
#include <unistd.h>
#include <sys/types.h>

int ok=0;

void my_handler(int sig) {
  ok = 1;
}


int main() {
  signal(SIGUSR1, my_handler);
  
  pid_t p = fork();
  if (p == 0) { 
    while(ok==1);
    printf("FILHO\n");
   
  
  } else { 
    printf("PAI\n");
    kill(SIGUSR1, getppid());
  }

}


