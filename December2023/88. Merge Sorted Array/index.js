/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    let i = 0; //iterate on nums1
    let j = 0; // iterate on nums2
    let k = 0; // iterate on result
    let result = Array(m+n).fill(0);
    while(i < m && j < n){
        if(nums1[i] < nums2[j]){
            result[k] = nums1[i];
            i++;
            k++;
        } else{
            result[k] = nums2[j];
            k++;
            j++;
        }
    }
    while( i < m ){
    result[k] = nums1[i];
        i++;
        k++;
    }
    while(j < n){
        result[k] = nums2[j];
        j++;
        k++;
    }

    for(let i=0; i<result.length; i++){
        nums1[i] = result[i]
        
    }
}