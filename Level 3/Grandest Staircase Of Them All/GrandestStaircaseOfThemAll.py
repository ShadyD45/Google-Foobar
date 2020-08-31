import json
import math

def calculate_steps(n):
    # pad size
    size = n + 1

    # create zero-filled matrix
    bricks = [[0 for _ in range(size)] for _ in range(size)]

    # base value is always padded and skipped
    bricks[0][0] = 1
    for prev in range(1, size):
        for left in range(0, size):
            bricks[prev][left] = bricks[prev - 1][left]
            if left >= prev:
                bricks[prev][left] += bricks[prev - 1][left - prev]

    return bricks[n][n] - 1

def answer(n):
    return calculate_steps(n)

    
