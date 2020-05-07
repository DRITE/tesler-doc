import React from 'react'
import {useViewTabs} from '@tesler-ui/core'
import ExamplePreview from 'components/ui/ExamplePreview/ExamplePreview'

export const ViewNavigation: React.FC = (props) => {
    // Get views of the active screen
    const tabs = useViewTabs(1) // 1 represents a top level views, i.e. the first level of navigation
    const content =  <ul>
        { tabs.map(item =>
            <li key={item.url}>
                <a href={`#${item.url}`}>
                    {item.title}
                </a>
            </li>
        )}
    </ul>
    return <ExamplePreview>
        {content}
    </ExamplePreview>
}

ViewNavigation.displayName = 'NavEx1'

export default ViewNavigation
