/*
* This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
*
* **/




// Name of the package must be same as the directory
// under which this file is saved
package myPackage;

import java.util.Scanner;

public class MyClass
{
    public void getNames(String s) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(s + "  "+ scanner.nextLine());
    }
}