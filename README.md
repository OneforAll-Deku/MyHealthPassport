
# MyHealthPassport

MyHealthPassport is an Android application built using Jetpack Compose that securely stores and manages patients' medical data. The app ensures privacy and easy access through robust authentication, cloud storage, and advanced image analysis features.

## Features

- **Secure Authentication:** Utilizes Firebase Authentication for secure login and registration.
- **Cloud Storage:** Stores medical data on Cloud Firestore, ensuring reliable and scalable data management.
- **Medical ID System:** Each patient's medical information is associated with a unique medical ID for easy and secure access.
- **Image Analysis:** Integrates Gemini API to analyze medical certificates and extract data using the Gemini-1.5-flash model.
- **User-Friendly Interface:** Designed with Jetpack Compose for a modern and intuitive user experience.

## App Demo

Youtube Link- https://youtu.be/cY1sU-AKsRY

## Screenshots

<img src="https://github.com/user-attachments/assets/19502c66-faa7-47a3-a10a-ab892dd0fe02" alt="Screenshot_20240807_020345" width="300"/>
<img src="https://github.com/user-attachments/assets/dbfce296-0321-4ad3-96de-29149b56adcf" alt="Screenshot_20240625_015445" width="300"/>
<img src="https://github.com/user-attachments/assets/76602f36-e36c-4fe6-a1f8-c319f761c2c7" alt="Screenshot_20240709_200116" width="300"/>

## Installation

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/MyHealthPassport.git
   ```
2. **Open the Project:**
   - Open the project in Android Studio.

3. **Set Up Firebase:**
   - Add your `google-services.json` file to the `app` directory.
   - Ensure Firebase Authentication and Cloud Firestore are set up in your Firebase project.

4. **Build and Run:**
   - Build the project and run it on an emulator or physical device.

## Usage

1. **Register:**
   - Create a new account using your email and password.
2. **Login:**
   - Log in to your account using the registered email and password.
3. **Add Medical Data:**
   - Enter your medical information and save it using your unique medical ID.
4. **Get Medical Data:**
   - Get your medical data by simply entering your unique medical ID.
5. **Upload Medical Certificate:**
   - Upload a bitmap image of your medical certificate from the gallery.
   - The Gemini API will analyze the image and provide a text response with the extracted data.

## Tools/Products

- **Jetpack Compose:** For building the UI.
- **Firebase Authentication:** For user authentication.
- **Cloud Firestore:** For storing medical data.
- **Gemini API:** For analyzing medical certificates.

## Project Structure

  - `Health`: Contains the screens and composables for managing health-related data.
  - `ViewModels`: Contains viewmodels.
  - `Navigation`: Contains NavGraph and Screen for navigation through composables.
  - `SignInSignUp`: Contains Signin and Signup page.

## Contributions

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries or support, please contact [LinkedIn](https://www.linkedin.com/in/anurag-kanojiya-101312286/).

---
