bool divByZero = false;
bool inLoop = false;
bool exitLoop = false;
bool endReached = false;
int activeLoopCount = 0;

int x;
int y;
int z;

active proctype main() {
    x = 10;
    y = 0;
    z = 0;
    if
    :: ((y == 0)) ->
        divByZero = true;
    :: else ->
        z = x / y;
    fi
    printf("%d\n", z);
endReachedLabel:
    endReached = true;
    skip;
}
