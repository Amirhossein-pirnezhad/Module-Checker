bool divByZero = false;
bool inLoop = false;
bool exitLoop = false;
bool endReached = false;
int activeLoopCount = 0;

int x;
int y;
int safe;

active proctype main() {
    x = 10;
    y = 0;
    safe = 1;
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
    printf("%d\n", safe);
endReachedLabel:
    endReached = true;
    skip;
}
