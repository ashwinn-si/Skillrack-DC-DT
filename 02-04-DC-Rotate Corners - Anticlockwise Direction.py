N = int(input())
matrix = [input().strip().split() for i in range(N)]
pointers = [[0, 0], [0, N-1], [N-1, N-1], [N-1, 0]]
for i in range(N // 2):
    alphaBets = []
    for j in range(4):
        alphaBets.append(matrix[pointers[j][0]][pointers[j][1]])
    for index in range(0, 4):
        matrix[pointers[index][0]][pointers[index][1]] = alphaBets[(index + 1) % 4]
    pointers[0][0] += 1
    pointers[0][1] += 1
    pointers[1][0] += 1
    pointers[1][1] -= 1
    pointers[2][0] -= 1
    pointers[2][1] -= 1
    pointers[3][0] -= 1
    pointers[3][1] += 1
for i in range(N):
    print(*matrix[i])