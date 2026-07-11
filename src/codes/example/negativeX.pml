bool divByZero = false;
bool inLoop = false;
bool exitLoop = false;
bool endReached = false;
int activeLoopCount = 0;

int x;
int i;

active proctype main() {
    x = 3;
    i = 0;
    activeLoopCount = activeLoopCount + 1;
    loopStartNo_1:
    do
    :: (i < 10) ->
        inLoop = true;
        exitLoop = false;
        x = x - 1;
        i = i + 1;
    :: else -> break
    od
    activeLoopCount = activeLoopCount - 1;
    exitLoop = true;
    if
    :: (activeLoopCount == 0) ->
        inLoop = false;
    :: else ->
        inLoop = true;
    fi
    printf("%d\n", x);
endReachedLabel:
    endReached = true;
    skip;
}
