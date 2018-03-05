import React, { Component } from 'react';
import { withStyles } from 'material-ui/styles';
import classnames from 'classnames';
import Grid from 'material-ui/Grid';

import WeiboCard from './WeiboCard.js';

const styles = theme =>({
  toolbar: Object.assign(theme.mixins.toolbar, {
    marginBottom: 15,
  }),
  container: {
  },
  content: {
    minHeight:500,
    width: '95%',
    margin: '0 auto',
  },
  item: {
  }
})

class Content extends Component {
  render() {
    const { classes } = this.props;
    return (
      <div className={classes.container}>
        <div className={classes.toolbar} />
        <Grid container className={classes.content} spacing={16} >
          <Grid item xs={12} sm={6} md={3} >
            <WeiboCard />
          </Grid>
          <Grid item xs={12} sm={6} md={3}>
            <WeiboCard />
          </Grid>
          <Grid item xs={12} sm={6} md={3}>
            <WeiboCard />
          </Grid>
          <Grid item xs={12} sm={6} md={3}>
            <WeiboCard />
          </Grid>
          <Grid item xs={12} sm={6} md={3}>
            <WeiboCard />
          </Grid>
        </Grid>
      </div>
    )
  }
}

export default withStyles(styles)(Content);
