//Before Class (Aug.8, 2025)

//1. Lesson 1 Topic 1 Arrays
/*
1. What advantage do arrays offer in terms of data access?
  - Efficient storage and access
2. What is the index range for the first and last element of an array?
  - 0 to arraySize - 1
3. What is the importance of arrays in loops and iterations?
  - Facilitating iteration and operation execution
4. What is the versatility of arrays in programming?
  - Support for diverse data types
5. Why are arrays foundational in algorithms, data structures, and programming practices?
  - They facilitate efficient data storage and manipulation
6. What is the purpose of arrays in programming?
  - Grouping data
7. How are array elements usually accessed?
  - Using indices
8. What advantage do arrays offer in terms of data organization?
  - Facilitating the organization of related data items into a coherent structure
9. How do arrays enhance iteration and processing?
  - By streamlining iterative processes and efficiently handling sizable datasets
10. What is the flexibility of arrays?
  - Dynamic memory allocation techniques enable resizing to cater to varying data volumes
*/


//2. Lesson 1 Topic 2 One Dimensional Arrays
//Array Vowel Count
/*
Enter 8 characters:
h
e
l
l
o
w
o
r
Number of vowel elements: 3
*/
#include <iostream>
int main(){
    using namespace std;
    char chars[8];
    int count = 0;
    cout << "Enter 8 characters:" << endl;
    for(int i=0; i<8; i++){
        cin >> chars[i];
        char c = chars[i]; 
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || 
           c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            count++;
        }
    }
    cout << "Number of vowel elements: " << count << endl;
    return 0;
}

//Integer Array
/*
10 20 30 40 50 60 70 80 90 100
*/
using namespace std;
    int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    for(int i=0; i<10; i++){
        cout << arr[i] << " ";
    }

//Array Sum
/*
Enter 5 integer numbers:
1
2
3
4
5
Sum: 15
*/
using namespace std;
    int num[5], sum = 0;
    cout << "Enter 5 integer numbers:" << endl;
    for(int i=0; i<5; i++){
        cin >> num[i];
        sum = num[i] + sum;
    }
    cout << "Sum: " << sum;

//Double Separation Array
/*
Enter 6 double values:
1.111
2.222
3.333
4.444
5.555
6.666
Array elements:
1.111	2.222	3.333	4.444	5.555	6.666
*/
using namespace std;
    double num[6];
    cout << "Enter 6 double values:" << endl;
    for(int i=0; i<6; i++){
        cin >> num[i];
    }
    cout << "Array elements:" << endl;
    for(int i=0; i<6; i++){
        cout << fixed << setprecision(3) << num[i] << "	";
    }

//Average of Floating-Point Numbers
/*
Enter 10 floating-point numbers:
1
2
3
4
5
6
7
8
9
10
The average is: 5.50
*/
using namespace std;
    float num[10], sum = 0, ave = 0;
    cout << "Enter 10 floating-point numbers:" << endl;
    for(int i=0; i<10; i++){
        cin >> num[i];
        sum = num[i] + sum;
    }
    ave = sum/10;
    cout << fixed << setprecision(2) << "The average is: " << ave;


//3. Lesson 1 Topic 3 Multi Dimensional Arrays
//2D Array Input and Print
/*
Enter the number of rows: 2
Enter the number of columns: 2
Enter the elements of the array:
Element at [0][0]: 1
Element at [0][1]: 2
Element at [1][0]: 3
Element at [1][1]: 4
Elements of the array:
1 2 
3 4
*/
using namespace std;
    int r, c;
    cout << "Enter the number of rows: ";
    cin >> r;
    cout << "Enter the number of columns: ";
    cin >> c;
    int arr[r][c];
    cout << "Enter the elements of the array:" << endl;
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            cout << "Element at [" << i << "][" << j << "]: ";
            cin >> arr[i][j];
        }
    }
    cout << "Elements of the array:" << endl;
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            cout << arr[i][j] << " ";
        }
        cout << "" << endl;
    }

//Matrix Differences Counter
/*
Enter the number of rows: 2
Enter the number of columns: 2
Enter the elements of the first array:
Element at [0][0]: 1
Element at [0][1]: 2
Element at [1][0]: 3
Element at [1][1]: 4
Enter the elements of the second array:
Element at [0][0]: 4
Element at [0][1]: 3
Element at [1][0]: 2
Element at [1][1]: 1
Number of differences between the two matrices: 4
*/
using namespace std;
    int r, c;
    cout << "Enter the number of rows: ";
    cin >> r;
    cout << "Enter the number of columns: ";
    cin >> c;
    int arr1[r][c], arr2[r][c];
    cout << "Enter the elements of the first array:" << endl;
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            cout << "Element at [" << i << "][" << j << "]: ";
            cin >> arr1[i][j];
        }
    }
    cout << "Enter the elements of the second array:" << endl;
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            cout << "Element at [" << i << "][" << j << "]: ";
            cin >> arr2[i][j];
        }
    }
    int count = 0;
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            if(arr1[i][j] != arr2[i][j]){
                count++;
            }
        }
    }
    cout << "Number of differences between the two matrices: " << count;

//2D Array Row Sum Calculator
/*
Enter the number of rows: 2
Enter the number of columns: 2
Enter the elements of the array:
Element at [0][0]: 4
Element at [0][1]: 4
Element at [1][0]: 8
Element at [1][1]: 8
Sum of each row:
8
16
*/
using namespace std;
    int r, c;
    cout << "Enter the number of rows: ";
    cin >> r;
    cout << "Enter the number of columns: ";
    cin >> c;
    int arr[r][c];
    cout << "Enter the elements of the array:" << endl;
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            cout << "Element at [" << i << "][" << j << "]: ";
            cin >> arr[i][j];
        }
    }
    int sum = 0;
    cout << "Sum of each row:" << endl;
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            sum = arr[i][j] + sum;
        }
        cout << sum << endl;
        sum = 0;
    }

//2D Array Row Average Calculator
/*
Enter the number of rows: 2
Enter the number of columns: 3
Element at [0][0]: 4
Element at [0][1]: 1
Element at [0][2]: 3
Element at [1][0]: 6
Element at [1][1]: 1
Element at [1][2]: 2
Averages of each row:
Row 1: 2.67
Row 2: 3.00
*/
using namespace std;
    int r, c;
    cout << "Enter the number of rows: ";
    cin >> r;
    cout << "Enter the number of columns: ";
    cin >> c;
    int arr[r][c];
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            cout << "Element at [" << i << "][" << j << "]: ";
            cin >> arr[i][j];
        }
    }
    int sum = 0;
    float ave = 0;
    cout << "Averages of each row:" << endl;
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            sum = arr[i][j] + sum;
        }
        ave = sum/(float)c;
        cout << fixed << setprecision(2) << "Row " << i+1 << ": " << ave << endl;
        sum = 0;
    }

//2D Array Printer
/*
1	2	3	4	5
6	7	8	9	10
11	12	13	14	15
16	17	18	19	20
21	22	23	24	25
*/
using namespace std;
    int arr[5][5];
    int num = 1;
    for(int i=0; i<5; i++){
        for(int j=0; j<5; j++){
            arr[i][j] = num++;
        }
    }
    for(int i=0; i<5; i++){
        for(int j=0; j<5; j++){
            cout << arr[i][j] << "\t";
        }
        cout << "" << endl;
    }


//4. Lesson 1 Topic 4 Array Traversal
//Moving Zeroes
/*
Enter the size of the array: 10
Enter the elements of the array:
Element 0: 1
Element 1: 0
Element 2: 2
Element 3: 0
Element 4: 3
Element 5: 4
Element 6: 5
Element 7: 0
Element 8: 6
Element 9: 7
Array with zeros moved to the end: 1 2 3 4 5 6 7 0 0 0
*/
using namespace std;
    int size;
    cout << "Enter the size of the array: ";
    cin >> size;
    int arr[size];
    cout << "Enter the elements of the array:" << endl;
    for(int i=0; i<size; i++){
        cout << "Element " << i << ": ";
        cin >> arr[i];
    }
    int index = 0;
    for(int i=0; i<size; i++){
        if(arr[i]!=0){
            arr[index++] = arr[i];
        }
    }
    while(index < size){
        arr[index++] = 0;
    }
    cout << "Array with zeros moved to the end: ";
    for(int i=0; i<size; i++){
        cout << arr[i] << " ";
    }

//Array Sum Calculator
/*
Enter the size of the array: 5
Enter the elements of the array:
1
2
3
4
5
The sum of the elements is 15
*/
using namespace std;
    int size;
    cout << "Enter the size of the array: ";
    cin >> size;
    int arr[size], sum = 0;
    cout << "Enter the elements of the array:" << endl;
    for(int i=0; i<size; i++){
        cin >> arr[i];
        sum = arr[i] + sum;
    }
    cout << "The sum of the elements is " << sum;

//Running Array Sum Calculator
/*
Enter the size of the array: 5
Enter the elements of the array:
Element 0: 0
Element 1: 1
Element 2: 2
Element 3: 3
Element 4: 4
Sum of each addition of the elements:
0 1 3 6 10
*/
using namespace std;
    int size;
    cout << "Enter the size of the array: ";
    cin >> size;
    int arr[size];
    cout << "Enter the elements of the array:" << endl;
    for(int i=0; i<size; i++){
        cout << "Element " << i << ": ";
        cin >> arr[i];
    }
    int sum = 0;
    cout << "Sum of each addition of the elements:" << endl;
    for(int i=0; i<size; i++){
        sum = arr[i] + sum;
        cout << sum << " ";
    }

//Largest Element in Array Finder
/*
Enter the size of the array: 5
Enter the elements of the array:
Element 0: 1
Element 1: 2
Element 2: 3
Element 3: 4
Element 4: 5
The largest element in the array is: 5
*/
using namespace std;
    int size;
    cout << "Enter the size of the array: ";
    cin >> size;
    int arr[size];
    cout << "Enter the elements of the array:" << endl;
    for(int i=0; i<size; i++){
        cout << "Element " << i << ": ";
        cin >> arr[i];
    }
    int flag = 0;
    for(int i=0; i<size; i++){
        if(arr[i] > flag){
            flag = arr[i];
        }
    }
    cout << "The largest element in the array is: " << flag;

//Second Largest Element in Array Finder
/*
Enter the size of the array: 10
Enter the elements of the array:
Element 0: 1
Element 1: 2
Element 2: 3
Element 3: 4
Element 4: 5
Element 5: 6
Element 6: 7
Element 7: 8
Element 8: 9
Element 9: 10
The second largest element in the array is: 9
*/
using namespace std;
    int size;
    cout << "Enter the size of the array: ";
    cin >> size;
    int arr[size];
    cout << "Enter the elements of the array:" << endl;
    for(int i=0; i<size; i++){
        cout << "Element " << i << ": ";
        cin >> arr[i];
    }
    int flag = -100, flag2 = -100;
    for(int i=0; i<size; i++){
        if(arr[i] > flag){
            flag = arr[i];
        }
    }
    for(int i=0; i<size; i++){
        if(flag2<arr[i] && arr[i]<flag){
            flag2 = arr[i];
        }
    }
    cout << "The second largest element in the array is: " << flag2;
