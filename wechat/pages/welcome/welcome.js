Page({
    onTap: function (event) {
        wx.navigateTo({
          url:"../index/index"
        });
        
        // wx.switchTab({
        //     url: "../index/index"
        // });
      
    },
    onReachBottom:function(event){
      console.log('asfasdfa')
    }
})