package ch05;

import java.util.Arrays;

public class Ex04_ArrayCopy {

	public static void main(String[] args) {
		int src[] = {1,3,4,8};
		int[] dst = src;
		System.out.println(Arrays.toString(dst));
		
		dst[3] = 99;
		System.out.println(Arrays.toString(src));
		
		int[] realDst = new int[4];
		for (int i = 0; i < src.length; i++)
			realDst[i] = src[i];
		System.out.println(Arrays.toString(realDst));
		
		realDst[0] = 11;
		System.out.println(Arrays.toString(src));
		
		// 시스템 내장 기능으로 어레이를 복사
		int[] newSrc = {3,4,7,9};
		int[] newDst = new int[4];
		System.arraycopy(newSrc, 0, newDst, 0, newSrc.length);
		System.out.println(Arrays.toString(newDst));
		newDst[newDst.length - 1] = 88;
		System.out.println(Arrays.toString(newSrc));
		
		// 2차원의 배열은 한 행마다 clone을 해줘야 함.
	}

}
