/*
 * There are several clans in a civilization and they are arranged in a matrix
 * form with R rows and C columns.
 * A member of a clan (represented by a 1) is seated adjacent (left, right, top,
 * or bottom) to another member belonging to his clan.
 * 
 * The king wants to merge clans by placing a negotiator in any of the cells
 * with a 0.
 * But the king can place only one negotiator.
 * 
 * The negotiator helps in merging all adjacent clans and forming a larger clan.
 * 
 * The program must print the size of the largest clan (including the negotiator
 * himself) that can be formed by placing the negotiator in the best possible
 * position.
 * 
 * Input:
 * 5 6
 * 0 1 1 1 0 0
 * 1 0 0 0 0 0
 * 1 0 0 0 0 0
 * 1 1 1 0 1 0
 * 0 0 0 1 1 1
 * 
 * Output:
 * 10
 * 
 * Input:
 * 10 7
 * 0 1 0 0 0 1 0
 * 1 0 0 0 1 0 1
 * 1 1 1 0 0 1 1
 * 1 1 1 1 0 0 0
 * 0 0 1 0 1 0 1
 * 1 1 0 0 1 1 1
 * 1 0 1 0 0 1 0
 * 1 0 0 1 0 0 0
 * 1 0 0 1 0 0 0
 * 0 1 0 0 1 1 1
 * 
 * Output:
 * 23
 * 
 */