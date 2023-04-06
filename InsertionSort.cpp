#include<iostream>
using namespace std;
int main()
{
    int arr[6] = {8, 5, 1, 4, 6, 2};

    int n = 6;

    for(int i = 1; i < n; i++)
    {
        int curr = arr[i];
        int j = i - 1;

        for(int j = i - 1; j >= 0; j --)
        {
            if(arr[j] > curr)
            {
                arr[j + 1] = arr[j] + arr[j + 1];
                arr[j] = arr[j + 1] - arr[j];
                arr[j + 1] = arr[j + 1] - arr[j];
            }

            else
            {
                break;
            }

        }
    }

    for(int i = 0; i < n; i ++)
    {
        cout << arr[i] << endl;
    }
}