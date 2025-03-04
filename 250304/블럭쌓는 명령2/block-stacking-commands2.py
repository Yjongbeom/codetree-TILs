n, k = map(int, input().split())
commands = [tuple(map(int, input().split())) for _ in range(k)]

l = [0 for _ in range(n)]

for a, b in commands:
    for i in range(a, b+1):
        l[i-1] += 1

print(max(l))