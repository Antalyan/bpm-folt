## Project description

The repository contains source code for JBPM business process management platform.

The project was created within the course PV207: Business Process Management at the Faculty of Informatics, Masaryk University. 

The full project analysis is available in *FOLT_analysis.pdf* and contains mission and vision, (fictional) organisation structure, goals and objectives including KPI/KRIs, process descriptions and BPMN diagrams, and implementation description.   

## Topic

The idea behind this is to design a platform for delivering soon-to-expire food from supermarkets to the end customers. Any unsold food should be cooked in the restaurant. 

## Authors

- Ondřej Dacer
- Michael Koudela
- Peter Šípoš

## Setup intructions
Important note: default branch must be **master**, not **main**

### How to share it with others
1. **git clone https://github.com/peter-sipos/FOLT.git** (locally, the first person uses **git init**)
2. **cd FOLT**
3. **create a namespace FOLT in jbpm**
4. **import project -> paste https://github.com/peter-sipos/FOLT.git** (no authentication info needed)
5. **git remote add business-central ssh://wbadmin@localhost:8001/FOLT/FOLT**

### How to make changes 

1. **do changes in jbpm platform** (do not forget to click on save)
2. locally: **git checkout "branch-name"** 
3. **git pull business-central "branch-name"** (password wbadmin)
4. **git push origin "branch-name"**

### How to download changes 
1. locally: **git checkout "branch-name"** 
2. **git pull origin "branch-name"**
3. **git push business-central "branch-name"** (password wbadmin)
