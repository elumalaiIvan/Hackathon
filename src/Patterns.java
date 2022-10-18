public class Patterns {
    public static void main(String[] args) {
        print5432_(6);
    }
    static void print5432_ (int input) {
//        System.out.println((input+1)/2);
        for (int i = input; i >= 1; i--) {
            for (int j = input; j>=1; j--) {
                if (j == i || j == (input - i) + 1) System.out.print("* \t");
                else if (j == (input+1)/2 || (input%2 == 0 && j == (input+2)/2)) System.out.print("* \t");
                else System.out.print(j + "\t");
            }
            System.out.println("\n");
        }
    }
}

/*5,1 5-4   5-5 = 0
4,2 4-2   5-4 = 1
3,3 3-0   5-3 = 2
2,4 2+2   5-2 = 3
1,5 1+4   5-1 = 4*/

/*5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1*/


/*sample output for odd input 5
* 	4	* 	2	*

5	* 	* 	* 	1

5	4	* 	2	1

5	* 	* 	* 	1

* 	4	* 	2	*

*/

/* sample input for even input:6
consider two center position
left, right diagnols
* 	5	* 	* 	2	*

6	* 	* 	* 	* 	1

6	5	* 	* 	2	1

6	5	* 	* 	2	1

6	* 	* 	* 	* 	1

* 	5	* 	* 	2	*
 */
