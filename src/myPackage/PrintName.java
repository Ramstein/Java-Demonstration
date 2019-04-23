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
* */


/*import 'MyClass' class from 'names' mypackage */

import myPackage.*;

class PrintName {
    public static void main(String ... args){
        //initializing the string variable
        //with a value
        String name = "Geeks for Geeks " ;

        //Creating an instance of MyClass in the package.

        MyClass myClass = new MyClass();
         myClass.getNames(name);
    }


}
