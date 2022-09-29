/* Today, we are building on our knowledge of arrays by adding another dimension. Check out the Tutorial tab for learning materials and an instructional video.

Context
Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.

Task
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

Example

In the array shown above, the maximum hourglass sum is  for the hourglass in the top left corner.

Input Format

There are  lines of input, where each line contains  space-separated integers that describe the 2D Array .

Constraints

Output Format

Print the maximum hourglass sum in .

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

 contains the following hourglasses:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
The hourglass with the maximum sum () is:

2 4 4
  2
1 2 4
*/

package challenges;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();
        int sum = 0;
        int[][] all = new int[4][4];


        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
            for(int m = 0; m < 4 ; m++){
                for(int n = 0; n < 4 ; n++){
                    sum = 0;
                    for(int i = m; i < m+3 ; i++){
                        if(i == m || i == m+2){
                            for(int j = n ; j < n+3 ; j++){
                                sum += arr.get(i).get(j);
                            }
                        }else if(i == m+1){
                                int k = n+1;
                                sum+= arr.get(i).get(k);
                        }
                    }
                    
                    all[m][n] = sum;
                }
            }   
            
            int max = all[0][0];  
            for(int m = 0; m < 4 ; m++){
                for(int n = 0; n < 4 ; n++){
                    if(max < all[m][n]) max = all[m][n];
                }
            }
            System.out.println(max); 
            
                bufferedReader.close();
        }
        
    }


