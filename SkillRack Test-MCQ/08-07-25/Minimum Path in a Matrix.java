/*
 * Given a matrix where 0 represents a path and 1 represents a blocked cell,
 * print the length of the shortest path from 'R' (start) to 'C' (destination).
 * Cells marked 'R' and 'C' are guaranteed to be on the border. You may move up,
 * down, left, or right.
 * 
 * Input:
 * Matrix as rows of space-separated values. Use 'R' for start, 'C' for
 * destination, zero for open path, one for blocked.
 * 
 * Example Input:
 * 
 * 1 0 1 0 1
 * R 0 1 0 0
 * 0 0 1 1 0
 * 0 0 0 0 C
 * 
 * Example Output:
 * 
 * 7
 */