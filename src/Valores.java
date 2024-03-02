

import java.util.Iterator;

public class Valores implements ValoresITF {
	int[] aValores = new int[10];

	@Override
	public boolean ins(int v) {
		if (v > 0) {
			for (int j = 0; j < 10; j++) {
				if (aValores[j] == 0) {
					aValores[j] = v;
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public int del(int i) {
		if (i >= 0 && i < 10) {
			if (aValores[i] != 0) {
				int k = aValores[i];
				aValores[i] = 0;
				return k;
			}
		}

		return -1;
	}

	@Override
	public int size() {
		int count = 0;
		for (int j = 0; j < 10; j++) {
			if (aValores[j] != 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Valores v = new Valores();

		for (int j = 1; j <= 10; j++) {
			v.ins(j);
		}

		System.out.println(v.del(3));

		System.out.println(v.size());
	}

}
