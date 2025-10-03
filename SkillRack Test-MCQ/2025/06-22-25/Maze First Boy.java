/*
 * There is a maze with R rows and C columns filled Wlth integer values. A
 * positive or
 * negative value indicates that there is a path and O indicates that there is a
 * block and a
 * person cannot travel through the cell. The starting positions(row and column
 * index
 * of the starting cells) of boys A and B are passed as the input and they need
 * to
 * reach the bottom -right cell (with index R-1 and C-1) by traversing adjacent
 * cells (left
 * right top or bottom). Other than the starting cell while traversing other
 * cells, a
 * positive value will increase the health of a boy by the cell value and a
 * negative value
 * will decrease the health of a boy by the cell value. If the health of a boy
 * traversing the
 * matrix becomes negative(before reaching the destination), then he cannot
 * reach the
 * destination cell. In 1 minute, a boy can traverse just one cell.
 * The program must print the boy reaching the destination first. If both reach
 * in the
 * same time, print 80TH as the output. If both A and 8 cannot reach the
 * destination
 * (due to path not available or the health becoming negative), then print
 * BOTHCANNOT as the output.
 * 
 * Input:
 * 6 6
 * -1 3 3 -4 5 2
 * 6 -4 -3 5 5 8
 * 10 5 -2 -2 1 9
 * -1 9 10 8 1 -1
 * -2 8 7 -2 1 -2
 * 10 -4 -3 2 9 7
 * 0 1
 * 1 0
 * 
 * Output:
 * BOTH
 * 
 * Input:
 * 9 6
 * -4 -3 -4 -4 3 1
 * 4 6 10 -4 -3 -1
 * 9 10 6 -4 4 10
 * 0 -2 1 -3 7 2
 * 1 8 7 5 9 3
 * -2 -2 -2 4 7 9
 * -3 8 7 7 1 -3
 * -3 1 -4 -2 8 -2
 * 3 -2 8 -4 -2 4
 * 0 0
 * 0 1
 * 
 * Output:
 * B
 */