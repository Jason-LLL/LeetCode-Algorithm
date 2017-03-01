<<<<<<< HEAD
 string prefix="";
        if(strs.size()==0)  return prefix;
        
        /** check char by char, for each char, check all the string word **/
        for(int k=0; k<strs[0].size(); k++){
            int i=1;
            for(; i<strs.size() && strs[i].size()>k; i++){
                if(strs[i][k]!=strs[0][k])
                    return prefix;
            }
            if(i==strs.size()) prefix+=strs[0][k];
        }
        return prefix;
=======
 string prefix="";
        if(strs.size()==0)  return prefix;
        
        /** check char by char, for each char, check all the string word **/
        for(int k=0; k<strs[0].size(); k++){
            int i=1;
            for(; i<strs.size() && strs[i].size()>k; i++){
                if(strs[i][k]!=strs[0][k])
                    return prefix;
            }
            if(i==strs.size()) prefix+=strs[0][k];
        }
        return prefix;
>>>>>>> cecf2dfa9be01e64d36f8544e18268381542c885
    }