bool divByZero = false;
bool inLoop = false;
bool exitLoop = false;
bool endReached = false;
int activeLoopCount = 0;

int i;
int x;

active proctype main() {
    i = 0;
    x = 0;
    activeLoopCount = activeLoopCount + 1;
    loopStartNo_1:
    do
    :: (i < 5) ->
        inLoop = true;
        exitLoop = false;
        i = i;
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
