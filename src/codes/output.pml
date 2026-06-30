bool divByZero = false;
bool inLoop = false;
bool exitLoop = false;
bool endReached = false;
int activeLoopCount = 0;

int x;
int y;
int i;
int safe;

active proctype main() {
    x = 10;
    y = 2;
    i = 0;
    safe = 0;
    bool errFlag_1 = false;
    if
    :: ((y == 0)) ->
        divByZero = true;
        errFlag_1 = true;
        goto catchCheck_1;
    :: else ->
        safe = x / y;
    fi
    catchCheck_1:
    if
    :: (errFlag_1) ->
        safe = 0;
    :: else -> skip;
    fi
    activeLoopCount = activeLoopCount + 1;
    loopStartNo_1:
    do
    :: (i < 5) ->
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
    int j;
    j = 0;
    activeLoopCount = activeLoopCount + 1;
    do
    :: (j < 3) ->
        inLoop = true;
        exitLoop = false;
        safe = safe + j;
    loopUpdate_2:
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
    if
    :: (x >= 0) ->
        safe = safe + 1;
    :: else ->
        safe = 0;
    fi
    printf("%d\n", safe);
endReachedLabel:
    endReached = true;
    skip;
}
