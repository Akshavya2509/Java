
#include <stdio.h>
#include <sys/ipc.h> 
#include <sys/msg.h>
#include <sys/types.h>

struct mesg_buffer {
    long mesg_type;
    int a;
} message;

int main()
{
    key_t key;
    int msgid, i;
    key = ftok("hello", 100);

    msgid = msgget(key, 0666 | IPC_CREAT);
    message.mesg_type = 1;

    printf("Enter Data 1: ");
    scanf("%d", &message.a);

    msgsnd(msgid, &message, sizeof(message), 0);

    return 0;
}



