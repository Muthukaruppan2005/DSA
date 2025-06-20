import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    int a=n.nextInt();
    int no=n.nextInt();
    n.nextLine();
    String str=n.nextLine();
    int f=-1;
    if(str.equals("undirected")){
      f=0;
    }else if(str.equals("directed")){
      f=1;
    }
    int arr[][]=new int[a][a];
    for(int i=0;i<no;i++){
      int x=n.nextInt();
      int y=n.nextInt();
        arr[x][y]=1;
      if(f==0){
        arr[y][x]=1;
      }
    }
    for(int i=0;i<a;i++){
      for(int j=0;j<a;j++){
        if(j==a-1){
          System.out.print(arr[i][j]);
        }else{
          System.out.print(arr[i][j]+" ");
        }
      }
      System.out.println();
    }
  
  }
}
-------------------
  /*
  You are required to implement a graph using an adjacency matrix. Your program should support both directed and undirected graphs and allow adding edges between vertices.

Given the number of vertices and edges, and the type of the graph (directed or undirected), represent the graph using an adjacency matrix and print the final matrix.

Input Format:

The first line contains two integers n and m, the number of vertices and edges respectively.

The second line contains a string type which is either "directed" or "undirected".

The next m lines each contain two integers u and v, representing an edge from vertex u to vertex v.

Note: Vertices are numbered from 0 to n - 1.

Output Format:

Output the adjacency matrix of the graph in n lines, each containing n space-separated integers.


Constraints:
1 <= n <= 100

0 <= m <= n*(n-1) for directed graphs

0 <= u, v < n


Example:
Sample Input 1:
4 5
undirected
0 1
0 2
1 2
1 3
2 3

Sample Output 1:
0 1 1 0
1 0 1 1
1 1 0 1
0 1 1 0

Sample Input 2:
3 3
directed
0 1
1 2
2 0

Sample Output 2:
0 1 0
0 0 1
1 0 0
  */
