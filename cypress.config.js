const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    setupNodeEvents(on, config) {
    },
      video:true,
      videoUploadOnPasses: false,
      videosFolder:'cypress/videos' 
      // implement node event listeners here
    
  },
});
