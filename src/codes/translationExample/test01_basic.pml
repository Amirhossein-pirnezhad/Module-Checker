bool divByZero = false;
bool inLoop = false;
bool exitLoop = false;
bool endReached = false;
int activeLoopCount = 0;

int x;
int y;
int z;

active proctype main() {
    x = 1;
    y = 2;
    z = 0;
    z = x + y * 3;
    printf("%d\n", z);
endReachedLabel:
    endReached = true;
    skip;
}
