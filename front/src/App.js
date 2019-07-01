import React from 'react';
import './App.scss';
import Stores from "./Store";
import {Provider} from "mobx-react";
import {BrowserRouter, Route} from "react-router-dom";
import User from "./User";
import Category from "./Category";
import Cart from "./Cart";
import Header from "./Header";

function App() {
  return (
      <Provider stores={Stores}>
        <BrowserRouter>
          <header className="app-header">
              <Header/>
              <Category/>
          </header>

          <section className="app-body">
            <Route path="/user/:command?/:userId?" exact component={User}/>
            <Route path="/cart/:command?/:basketId?" exact component={Cart}/>
          </section>
        </BrowserRouter>
      </Provider>
  );
}

export default App;
