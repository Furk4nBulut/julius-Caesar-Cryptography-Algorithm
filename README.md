# Julius Caesar's Cryptography Algorithm

This Java program implements the Julius Caesar's Cryptography Algorithm, also known as Caesar Cipher. The Caesar Cipher is a substitution cipher where each letter in the plaintext is shifted a fixed number of places down or up the alphabet.

## Features

- Encrypts a message by converting letters to their corresponding numeric values and applying a shift.
- Decrypts the message by shifting the numeric values back to letters.
- Validates the input message to ensure it contains only uppercase letters and spaces, and does not include invalid characters like Turkish letters.

## Usage

1. **Run the Program**

   To run the program, compile the `Cryptography.java` file and execute it. The program will prompt you to enter a message to be encrypted.

   ```sh
   javac Cryptography.java
   java Cryptography
   ```

2. **Input Message**

   You will be asked to input a message. The message must only contain uppercase letters and spaces. The program will validate the input and prompt you to re-enter the message if it contains invalid characters.

3. **Encryption**

   After providing a valid message, the program will encrypt it by converting each letter to its corresponding position in the alphabet and shifting it by 3 positions.

4. **Decryption**

   The program will then decrypt the message, reversing the encryption process and displaying the original message.

## Code Explanation

### `takeMessage()`
Prompts the user to input a message, converts it to uppercase, and validates it.

### `control(String message)`
Validates the input message to ensure it contains only uppercase letters and spaces. It also checks for invalid characters.

### `encryptedMessage()`
Encrypts the message by converting each letter to its corresponding numeric value and applying a shift of 3. Spaces are preserved.

### `decryptedMessage()`
Decrypts the message by reversing the encryption process. It shifts the numeric values back to letters and constructs the decrypted message.

## Example

```
Input your message to convert:
HELLO WORLD
Encrypted version is: 7 4 11 11 14 22 14 17 11 3
Decrypted version is: 10 7 14 14 17 25 17 20 14 6
```

## Note

- The Caesar Cipher is a simple substitution cipher and is not suitable for secure communication.
- Ensure that the input message does not contain lowercase letters, punctuation, or special characters.
