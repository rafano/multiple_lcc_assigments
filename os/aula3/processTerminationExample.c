#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/wait.h>

int main() {
  pid_t pid;
  int status;

  if((pid = fork()) < 0) {
    /*fork failed */
  }
  else if( pid ==0) {
    printf("pid %d exiting ...\n" , getpid());
    exit(5);
  }
  else {
    wait(&status);
    printf("child %d exit status %d\n" ,pid ,WEXITSTATUS(status));
  }
  exit(0);
}
