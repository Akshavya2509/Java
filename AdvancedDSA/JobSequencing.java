#include<bits/stdc++.h>

class JobSequencing{


    bool comparator(Job a, Job b)
    {
        return a.profit > b.profit;
    }
    class Solution 
    {
        public:
        
        vector<int> JobScheduling(Job arr[], int n) 
        { 
            
            sort(arr, arr+n, comparator);
            int counter = 0;
            int profit = 0;
            bool slot[n+1];
            for(int i=0; i<n+1; i++)
            {
                slot[i] = false;
            }
            for(int i=0; i<n; i++)
            {
                for(int j = arr[i].dead; j>0; j--)
                {
                    if(slot[j] == false)
                    {
                        slot[j] = true;
                        counter++;
                        profit += arr[i].profit;
                        break;
                    }
                }
            }
            vector<int> ans;
            ans.push_back(counter);
            ans.push_back(profit);
            return ans;
        }
    };


    int main() 
    { 
        int t;
        //testcases
        cin >> t;
        
        while(t--){
            int n;
            
            //size of array
            cin >> n;
            Job arr[n];
            
            //adding id, deadline, profit
            for(int i = 0;i<n;i++){
                    int x, y, z;
                    cin >> x >> y >> z;
                    arr[i].id = x;
                    arr[i].dead = y;
                    arr[i].profit = z;
            }
            Solution ob;
            //function call
            vector<int> ans = ob.JobScheduling(arr, n);
            cout<<ans[0]<<" "<<ans[1]<<endl;
        }
        return 0; 
    }
}