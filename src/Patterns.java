public class Patterns {
    public static void main(String[] args) {
        print5432_(6);
    }
    static void print5432_ (int input) {
        //loop for row
        for (int row = input; row >= 1; row--) {
            //loop for column
            for (int column = input; column>=1; column--) {
                boolean isLeftDiagnolPosition = column == row;
                boolean isRightDiagnolPosition = column == (input - row) + 1;
                boolean centerPosition = column == (input + 1) / 2;
                boolean isEvenInput = input % 2 == 0;
                boolean isSecondCenterPosition = column == (input + 2) / 2;

                if (isLeftDiagnolPosition || isRightDiagnolPosition) System.out.print("* \t"); //diagnols star
                if (centerPosition || (isEvenInput && isSecondCenterPosition)) System.out.print("* \t"); //center position stars
                else System.out.print(column + "\t"); //for digits
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
