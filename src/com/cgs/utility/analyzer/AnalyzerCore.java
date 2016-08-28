package com.cgs.utility.analyzer;
/*Copyright 2016 Christian R Jurado
 * Crusader Gaming Solutions

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

public class AnalyzerCore {

	public static float getAverage(Integer[] integers){
		float numberOfRolls = integers.length;
		float rollSum = 0;
		float result = 0;
		if(numberOfRolls > 0){
			for(int roll : integers){
					rollSum = rollSum + roll;
			}
		}
		else{
			return 0;
		}
		result = rollSum / numberOfRolls;
		return result;
	}
}