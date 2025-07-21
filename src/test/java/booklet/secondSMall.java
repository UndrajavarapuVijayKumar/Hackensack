package booklet;

public class secondSMall {
	public static void main(String[] args) {
		int[] arr = {4,3,12,55,312,121,1211,11,12};
		int min=0;int secondMin=0;int index=0;
		for(int i=0; i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}

/*
 * You're absolutely right to question this. Let’s break it down and fix your
 * code step-by-step with **real-life analogy** and **technical reasoning**.
 * 
 * ---
 * 
 * ### ❌ Issue in Your Code:
 * 
 * ```java int min = 0; ```
 * 
 * This sets `min` to 0 initially.
 * 
 * But your array contains all **positive numbers** greater than 0, so the
 * condition:
 * 
 * ```java if (min > arr[i]) ```
 * 
 * is **never true**, because 0 is **less than or equal to every element** in
 * the array.
 * 
 * Hence, `min` remains `0` even though `0` is **not in the array at all**.
 * 
 * ---
 * 
 * ### ✅ Correct Way:
 * 
 * ```java int min = arr[0]; // Start with first element ```
 * 
 * This ensures your comparison starts with a **real number from the array**,
 * which is essential for correct logic.
 * 
 * ---
 * 
 * ### 🧠 Real-Life Analogy:
 * 
 * Imagine you're trying to find the **shortest person in a room**.
 * 
 * ❌ If you assume the shortest person is **0 feet tall** (unrealistic!), you’ll
 * wrongly conclude that no one is shorter than that. ✅ Instead, you should
 * **start with the height of the first person** in the room — and compare
 * everyone else to that.
 * 
 * ---
 * 
 * ### ✅ Full Working Code to Find Second Smallest:
 * 
 * ```java public class SecondSmallest { public static void main(String[] args)
 * { int[] arr = {4, 3, 12, 55, 312, 121, 1211, 11, 12};
 * 
 * int min = Integer.MAX_VALUE; int secondMin = Integer.MAX_VALUE;
 * 
 * for (int num : arr) { if (num < min) { secondMin = min; min = num; } else if
 * (num < secondMin && num != min) { secondMin = num; } }
 * 
 * System.out.println("Smallest: " + min);
 * System.out.println("Second Smallest: " + secondMin); } } ```
 * 
 * ---
 * 
 * ### 💡 Output:
 * 
 * ``` Smallest: 3 Second Smallest: 4 ```
 * 
 * ---
 * 
 * Let me know if you want to do the same for **second largest** or skip
 * duplicates too!
 */