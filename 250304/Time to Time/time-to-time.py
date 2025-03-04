a, b, c, d = map(int, input().split())

cnt = 0

while True:
    b += 1
    cnt += 1

    if b > 59:
        b = 0
        a += 1

    if a == c and b == d:
        break

print(cnt)