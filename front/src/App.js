import React from 'react';
import './App.scss';
import Stores from "./Store";
import {Provider} from "mobx-react";
import {BrowserRouter, Link, Route} from "react-router-dom";
import User from "./User";
import Category from "./Home/Category";

function App() {
  return (
      <Provider stores={Stores}>
        <BrowserRouter>
          <header className="app-header">
              <p><Link to={`/user`}>로그인</Link></p>
              <Category/>
          </header>

          <section className="app-body">
            <Route path="/user/:command?/:userId?" exact component={User}/>
          </section>
        </BrowserRouter>
      </Provider>
  );
}

export default App;
