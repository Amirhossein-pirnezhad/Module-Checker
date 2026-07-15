bool divByZero = false;
bool inLoop = false;
bool exitLoop = false;
bool endReached = false;
int activeLoopCount = 0;

int x;
int y;

active proctype main() {
    x = 2;
    y = 0;
    y = ((x) * (x) * (x));
    x = x + 1;
    y = y + 1;
    printf("%d\n", y);
endReachedLabel:
    endReached = true;
    skip;
}
