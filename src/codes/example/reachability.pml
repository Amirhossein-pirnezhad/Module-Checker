bool divByZero = false;
bool inLoop = false;
bool exitLoop = false;
bool endReached = false;
int activeLoopCount = 0;

int i;
int safe;
int x;

active proctype main() {
    i = 0;
    safe = 0;
    x = 0;
    activeLoopCount = activeLoopCount + 1;
    loopStartNo_1:
    do
    :: (i < 5) ->
        inLoop = true;
        exitLoop = false;
        safe = safe;
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
    int j;
    j = 0;
    activeLoopCount = activeLoopCount + 1;
    do
    :: (j < 3) ->
        inLoop = true;
        exitLoop = false;
        safe = safe + j;
    loopUpdate_2:
        j = j;
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
    printf("%d\n", safe);
endReachedLabel:
    endReached = true;
    skip;
}
