bool divByZero = false;
bool inLoop = false;
bool exitLoop = false;
bool endReached = false;
int activeLoopCount = 0;

int x;
int y;

active proctype main() {
    x = 3;
    y = 0;
    if
    :: (x > 0) ->
        y = 1;
    :: else ->
        y = 2;
    fi
    printf("%d\n", y);
endReachedLabel:
    endReached = true;
    skip;
}
