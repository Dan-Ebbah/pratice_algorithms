import java.util.Scanner;

public class ColoringSocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean correct = true;
		int sockCounter = 0;
		int machineCounter =0;
		int n = 0;
		int pointer =0;
		Scanner scan1 = new Scanner(System.in);
		int numSocks = scan1.nextInt();
		int left = numSocks;
		int maxMachines = scan1.nextInt();
		int colorDiff = scan1.nextInt();
		//scan1.close();
		//System.out.println("Color Difference: " + colorDiff);
		Scanner scan2 = new Scanner(System.in);
		int [] socks = new int [numSocks];
		System.out.println("Color Difference: " + colorDiff);
		for(int i =0; i<socks.length; i++)
		{
			socks[i] = scan2.nextInt();
		}
		//5 scan2.close();
		scan1.close();
		scan2.close();
		System.out.println("Left (before loop); "+ left);
		System.out.println("MachineCounter (before loop); "+ machineCounter);
		while (correct)
		{
			if (left > 1)
			{
				machineCounter++;
				System.out.println("MachineCounter (before for loop); "+ machineCounter);
				for(int i=n+1; i<numSocks; i++)
				{
					System.out.println("Machine counter (iteration " + i + "; "+ machineCounter);
					if((Math.abs((socks[n]-socks[i])) <= colorDiff))
					{
						sockCounter++;
						pointer = i+1;
						left--;
					}
					if (sockCounter == maxMachines)
					{
						machineCounter++;
						sockCounter = 0;
					}
				}
				left--;
				System.out.println("Left (after loop); "+ left);
				n = pointer;
			}
			else
			{
				machineCounter++;
				correct = false;
			}
		}
		System.out.println(machineCounter);
		}
	}

