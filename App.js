/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React from 'react';
import KeyEvent from 'react-native-keyevent';

import {
  SafeAreaView,
  StyleSheet,
  ScrollView,
  View,
  Text,
  TextInput,
  StatusBar,
} from 'react-native';

const App = () => {
  React.useEffect(() => {
    console.log('KeyEvent');
    console.log(KeyEvent);
    console.log(KeyEvent.onKeyDownListener);
    console.log(KeyEvent.onKeyUpListener);
    console.log(KeyEvent.onKeyMultipleListener);
    console.log(KeyEvent.thereShouldBeNothing);
    KeyEvent.onKeyDownListener((keyEvent) => {
      console.log('inside listener');
      console.log(`onKeyDown keyCode: ${keyEvent.keyCode}`);
      console.log(`Action: ${keyEvent.action}`);
      console.log(`Key: ${keyEvent.pressedKey}`);
    });
  });
  return (
    <>
      <StatusBar barStyle="dark-content" />
      <SafeAreaView>
        <ScrollView>
          <View>
            <Text>Hello world!</Text>
          </View>
        </ScrollView>
      </SafeAreaView>
    </>
  );
};

export default App;
