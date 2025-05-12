class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> pv;
        for(int i=0;i<nums.size();i++){
            int a=nums[i];
            int morenum=target-a;
            if(pv.find(morenum) != pv.end()) {
                return {pv[morenum],i};
            }
            pv[a]=i;


        }
       return {-1,-1}; 
    }
};