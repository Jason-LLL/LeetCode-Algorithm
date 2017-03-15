//常规的for循环遍历，算法复杂度O(n)

class Solution {
public:
	int xorSum(int l,int r) {
		if (l > r) {
			return - 1;  //返回-1表示错误
		}
		int temp = 0;
		for (int i = l; i <= r; i++) {
			temp ^= i;
		}
		return temp;
	}
};
//---------------------------------------- (优化算法-1)
 class Solution {
        public:
     int xorSum(int l, int r) {
	if (l > r) {
		return -1;  //返回-1表示错误
	}
	int fl = 0;
	int fr = 0;
	l = l - 1;
	switch (l % 4) {
	case 1: fl = 1; break;
	case 2: fl = l + 1; break;
	case 3: fl = 0; break;
	case 0: fl = l; break;
	}
	switch (r % 4) {
	case 1: fr = 1; break;
	case 2: fr = r + 1; break;
	case 3: fr = 0; break;
	case 0: fr = r; break;
	}
	return fl ^ fr;
    	}
  };