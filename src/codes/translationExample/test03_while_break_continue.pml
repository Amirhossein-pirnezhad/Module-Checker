bool divByZero = false;
bool inLoop = false;
bool exitLoop = false;
bool endReached = false;
int activeLoopCount = 0;

int i;
int s;

active proctype main() {
    i = 0;
    s = 0;
    activeLoopCount = activeLoopCount + 1;
    loopStartNo_1:
    do
    :: (i < 5) ->
        inLoop = true;
        exitLoop = false;
        i = i + 1;
        if
        :: (i == 2) ->
            goto loopStartNo_1;
        :: else ->
            s = s + i;
        fi
        if
        :: (i == 4) ->
            break;
        :: else ->
            s = s;
        fi
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
    printf("%d\n", s);
endReachedLabel:
    endReached = true;
    skip;
}
