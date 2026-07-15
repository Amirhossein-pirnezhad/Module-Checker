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
        if
        :: (x / y > 1) ->
            z = 1;
        :: else ->
            z = 2;
        fi
    fi
    printf("%d\n", z);
endReachedLabel:
    endReached = true;
    skip;
}
