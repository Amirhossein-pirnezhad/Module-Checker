bool divByZero = false;
bool inLoop = false;
bool exitLoop = false;
bool endReached = false;
int activeLoopCount = 0;

int x;

active proctype main() {
    x = 0;
    int j;
    j = 0;
    activeLoopCount = activeLoopCount + 1;
    do
    :: (j < 3) ->
        inLoop = true;
        exitLoop = false;
        if
        :: (j == 1) ->
            goto loopUpdate_1;
        :: else ->
            x = x + j;
        fi
    loopUpdate_1:
        j = j + 1;
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
