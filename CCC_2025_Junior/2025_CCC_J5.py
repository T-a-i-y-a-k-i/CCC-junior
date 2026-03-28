def solve(r, c, m):
    pre = [0] * c
    cur = [0] * c

    # Initialize first row
    for i in range(c):
        pre[i] = (i + 1) % m
        if pre[i] == 0:
            pre[i] = m

    # Process remaining rows
    for i in range(1, r):
        for j in range(c):
            val = ((i * c) + j + 1) % m
            if val == 0:
                val = m

            if j == 0:
                adder = min(pre[j], pre[j + 1])
            elif j == c - 1:
                adder = min(pre[j], pre[j - 1])
            else:
                adder = min(pre[j], pre[j - 1], pre[j + 1])

            cur[j] = val + adder

        pre = cur[:]  # copy contents

    return min(pre)

r, c, m = map(int, input().split())
print(solve(r, c, m))
