#include <iostream>

using namespace std;

int getRemainder(int num, int divisor);

int main() {
    int num, divisor;
    char choice;

    do {
        cout << "**** DIVISIBILITY CHECKER ****" << endl;
        cout << "Enter a number: ";
        cin >> num;

        cout << "Select a divisibility rule (2-12): ";
        cin >> divisor;

        if (divisor < 2 || divisor > 12) {
            cout << "Invalid divisor. Please select a number between 2 and 12." << endl;
            continue;
        }

        if (getRemainder(num, divisor) == 0) {
            cout << num << " is divisible by " << divisor << "." << endl;
        } else {
            cout << num << " is not divisible by " << divisor << "." << endl;
        }

        cout << "Do you want to check another number? (y/n): ";
        cin >> choice;

    } while (choice == 'y' || choice == 'Y');

    return 0;
}

int getRemainder(int num, int divisor) {
    return (num - divisor * (num / divisor));
}
