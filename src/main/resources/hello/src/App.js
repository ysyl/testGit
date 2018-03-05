import React, { Component } from 'react';
import Button from 'material-ui/Button';
import Reboot from 'material-ui/Reboot';
import { withStyles } from 'material-ui/styles';
import blue from 'material-ui/colors/blue';
import { MuiThemeProvider, createMuiTheme } from 'material-ui/styles';
import Grid from 'material-ui/Grid';

import WeiBoDrawer from "./WeiBoDrawer.js";
import SimpleActionBar from "./ActionBar.js";
import Content from "./Content.js";

const styles = theme => ({
  root: {
    flexGrow: 1,
    zIndex: 1,
    overflow: 'hidden',
    position: 'relative',
  },
  toolbar: theme.mixins.toolbar,
});

const theme = createMuiTheme({
  palette: {
    primary: { main: '#fff' }, // Purple and green play nicely together.
    secondary: { main: '#11cb5f' }, // This is just green.A700 as hex.
  },
});

class App extends Component {
  state = {
    isDrawerOpen: false
  };
  handleToggleDrawer(isOpen) {
    return () => {
      this.setState({
        isDrawerOpen: isOpen
      })
    }
  };
  render() {
    const { classes } = this.props;
    return (
      <MuiThemeProvider theme={theme}>
          <Reboot />
          <div className={classes.root} color="primary">
            <SimpleActionBar openDrawer={this.handleToggleDrawer(true).bind(this)}/>
            <WeiBoDrawer variant="permanent" isDrawerOpen={this.state.isDrawerOpen} closeDrawer={this.handleToggleDrawer(false).bind(this)} />
            <Content />
          </div>
      </MuiThemeProvider>
    );
  }
}

export default withStyles(styles)(App);
