Setup intructions
=======================
Important note: default branch must be **master**, not **main**

### How to share it with others
1. **git clone https://github.com/peter-sipos/FOLT.git** (locally, first person uses **git init**)
2. **cd FOLT**
3. **create a namespace FOLT in jbpm**
4. **import project -> paste https://github.com/peter-sipos/FOLT.git** (no authentication info needed)
5. **git remote add business-central ssh://wbadmin@localhost:8001/FOLT/FOLT**

### How to make changes 

1. **do changes in jbpm platform** (do not forget to click on save)
2. locally: **git checkout <branch-name> 
3. **git pull business-central <branch-name>** (password wbadmin)
4. **git push**

### How to download changes 
1. locally: **git checkout <branch-name> 
2. **git pull**
3. **git push business-central <branch-name>** (password wbadmin)
